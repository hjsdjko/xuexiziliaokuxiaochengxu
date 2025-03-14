const menu = {
    list() {
        return [
    {
        "backMenu":[
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
    {
        "backMenu":[
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"观看记录",
                        "menuJump":"列表",
                        "tableName":"guankanjilu"
                    }
                ],
                "menu":"观看记录"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看"
                        ],
                        "menu":"公告信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"公告信息"
            }
			,
			{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"我发布的阅读资料",
                        "menuJump":"列表",
                        "tableName":"ziliaow"
                    }
                ],
                "menu":"我发布的阅读资料"
            }
			,
			{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"阅读资料",
			            "menuJump":"列表",
			            "tableName":"ziliao"
			        }
			    ],
			    "menu":"阅读资料"
			}
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"阅读资料收藏管理",
                        "menuJump":"列表",
                        "tableName":"ziliaoCollection"
                    }
                ],
                "menu":"我的阅读资料收藏"
            }
            ,
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"阅读资料留言信息",
                        "menuJump":"列表",
                        "tableName":"ziliaoLiuyan"
                    }
                ],
                "menu":"我的阅读资料留言信息"
            }
        ],
        "frontMenu":[
        ],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"是",
        "hasFrontRegister":"是",
        "roleName":"用户",
        "tableName":"yonghu"
    }
]

	}
}
export default menu;
