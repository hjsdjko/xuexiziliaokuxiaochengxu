<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					阅读资料名称</view>
				<input disabled
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.ziliaoName" type="text" v-model="ruleForm.ziliaoName" placeholder="阅读资料名称"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					资料类型</view>
				<picker @change="ziliaoTypesChange" :value="ziliaoTypesIndex" :range="ziliaoTypesOptions"
					range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.ziliaoTypes?ruleForm.ziliaoValue:"请选择资料类型"}}</view>
				</picker>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="ziliaoPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					封面</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.ziliaoPhoto" :src="ruleForm.ziliaoPhoto" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="ziliaoFileTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					文件</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.ziliaoFile" :src="ruleForm.ziliaoFile" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
		
			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#4477C5","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					ziliaoName: false,
					ziliaoTypes: false,
					ziliaoPhoto: false,
					ziliaoFile: false,
					yonghuId: false,
					ziliaoClickNumber: false,
					ziliaoYesnoTypes: false,
					ziliaoYesnoText: false,
					createTime: false,
				},
				ruleForm: {
					ziliaoName: '',
					ziliaoTypes: '', //数字
					ziliaoValue: '', //数字对应的值
					ziliaoPhoto: '',
					ziliaoFile: '',
					yonghuId: '',
					ziliaoClickNumber: '0',
					ziliaoYesnoTypes: '1', //数字
					ziliaoYesnoValue: '', //数字对应的值
					ziliaoYesnoText: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				ziliaoTypesOptions: [],
				ziliaoTypesIndex: 0,
				ziliaoYesnoTypesOptions: [],
				ziliaoYesnoTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let ziliaoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'ziliao_types',
			}
			let ziliaoTypes = await this.$api.page(`dictionary`, ziliaoTypesParams);
			this.ziliaoTypesOptions = ziliaoTypes.data.list
			/*下拉框*/
			let ziliaoYesnoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'ziliao_yesno_types',
			}
			let ziliaoYesnoTypes = await this.$api.page(`dictionary`, ziliaoYesnoTypesParams);
			this.ziliaoYesnoTypesOptions = ziliaoYesnoTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`ziliao`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.ziliaoId) {
				this.ruleForm.ziliaoId = options.ziliaoId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			ziliaoTypesChange(e) {
				this.ziliaoTypesIndex = e.target.value
				this.ruleForm.ziliaoValue = this.ziliaoTypesOptions[this.ziliaoTypesIndex].indexName
				this.ruleForm.ziliaoTypes = this.ziliaoTypesOptions[this.ziliaoTypesIndex].codeIndex
			},
			ziliaoYesnoTypesChange(e) {
				this.ziliaoYesnoTypesIndex = e.target.value
				this.ruleForm.ziliaoYesnoValue = this.ziliaoYesnoTypesOptions[this.ziliaoYesnoTypesIndex].indexName
				this.ruleForm.ziliaoYesnoTypes = this.ziliaoYesnoTypesOptions[this.ziliaoYesnoTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			ziliaoPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.ziliaoPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			ziliaoFileTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.ziliaoFile = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.ziliaoName)) {
					this.$utils.msg(`阅读资料名称不能为空`);
					return
				}
				if ((!this.ruleForm.ziliaoPhoto)) {
					this.$utils.msg(`封面不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`ziliao`, this.ruleForm);
				} else {
					await this.$api.save(`ziliao`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
