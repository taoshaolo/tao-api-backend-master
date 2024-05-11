INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (1, '获取当前用户名称', '获取用户名称', '/api/name/user', 'http://localhost:8090', '{
    "username": "nero"
}', null, null, '{"Content-Type": "application/json"}', '{"Content-Type": "application/json"}', 1, 'POST',
        1667508636207661058, '2023-06-14 21:18:10', '2023-07-10 11:24:01', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (26, '网易云音乐随机歌曲', '网易云音乐，随机歌曲输出。', '/api/rand.music', 'https://api.uomg.com',
        'sort=热歌榜&format=json',
        '[{"id":1,"name":"sort","isRequired":"否","type":"string","remark":"选择输出分类[热歌榜|新歌榜|飙升榜|抖音榜|电音榜]，为空输出热歌榜"},{"id":2,"name":"mid","isRequired":"否","type":"int","remark":"网易云歌单ID"},{"id":1688815371547,"name":"format","isRequired":"no","type":"string","remark":"选择输出格式[json|mp3]"}]',
        '[{"id":1688815422793,"name":"code","type":"string","remark":"返回的状态码"},{"id":1688815424624,"name":"data","type":"string","remark":"返回歌曲数据"},{"id":1688815425060,"name":"msg","type":"string","remark":"返回错误提示信息"}]',
        '{"Content-Type": "application/json"}', '{"Content-Type": "application/json"}', 1, 'GET', 1667508636207661058,
        '2023-07-08 16:30:06', '2023-07-08 19:43:01', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (27, '网易云音乐热门评论', '网易云音乐热门评论随机API接口', '/api/comments.163', 'https://api.uomg.com',
        'format=json',
        '[{"id":1688816624700,"name":"mid","isRequired":"no","type":"int","remark":"网易云歌单ID"},{"id":1688816632619,"name":"format","isRequired":"no","type":"string","remark":"选择输出格式[json|mp3]"}]',
        '[{"id":1688816648171,"name":"code","type":"string","remark":"返回的状态码"},{"id":1688816649732,"name":"data","type":"string","remark":"返回评论数据"},{"id":1688816650394,"name":"msg","type":"string","remark":"返回错误提示信息"}]',
        null, null, 1, 'GET', 1667508636207661058, '2023-07-08 17:05:42', '2023-07-10 11:24:32', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (29, '随机壁纸', '随机获取一个壁纸地址', '/sjbz/api.php', 'http://api.btstu.cn', 'lx=dongman&format=json',
        '[{"id":1689002138135,"name":"method","isRequired":"no","type":"string","remark":"输出壁纸端[mobile|pc|zsy]默认为pc"},{"id":1689002153560,"name":"lx","isRequired":"no","type":"string","remark":"选择输出分类[meizi|dongman|fengjing|suiji]，为空随机输出"},{"id":1689002153860,"name":"format","isRequired":"no","type":"string","remark":"输出壁纸格式[json|images]默认为images"}]',
        '[{"id":1689002171759,"name":"code","type":"string","remark":"返回的状态码"},{"id":1689002173057,"name":"imgurl\\t","type":"string","remark":"返回图片地址"},{"id":1689002173621,"name":"width","type":"string","remark":"返回图片宽度"},{"id":1689002184505,"name":"height\\t","type":"string","remark":"返回图片高度"}]',
        null, null, 1, 'GET', 1667508636207661058, '2023-07-09 20:28:31', '2024-05-09 20:21:13', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (30, '毒鸡汤', '随机生成一句毒鸡汤语录', '/yan/api.php', 'http://localhost:8090', 'charset=utf-8&encode=json',
        '[{"id":1689002041985,"name":"charset","isRequired":"no","type":"string","remark":"返回编码类型[gbk|utf-8]默认utf-8"},{"id":1689002080311,"name":"encode","isRequired":"no","type":"string","remark":"返回格式类型[text|js|json]默认text"}]',
        '[{"id":1689002092752,"name":"code","type":"string","remark":"code"}]', null, null, 1, 'GET',
        1667508636207661058, '2023-07-09 21:17:10', '2024-05-09 20:21:12', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (35, '获取IP信息', '获取IP信息的详细信息', '/api/ipInfo', 'https://api.vvhan.com', '',
        '[{"id":1715223656307,"name":"ip","isRequired":"no","type":"string","remark":"可输入详细ip"}]',
        '[{"id":1715223623343,"name":"success","type":"string"},{"id":1715223641112,"name":"ip","type":"string"},{"id":1715223652756,"name":"info","type":"string"}]',
        null, null, 1, 'GET', 1788196352006561794, '2024-05-09 10:55:21', '2024-05-09 20:21:10', 0);
INSERT INTO tao_api.interface_info (id, name, description, url, host, requestParams, requestParamsRemark,
                                     responseParamsRemark, requestHeader, responseHeader, status, method, userId,
                                     createTime, updateTime, isDelete)
VALUES (36, '抖音热搜热榜', '最新抖音热搜热榜', '/api/hotlist/douyinHot', 'https://api.vvhan.com', '',
        '[{"id":1715224523131,"name":"无","isRequired":"no","type":"无","remark":"无"}]',
        '[{"id":1715224717093,"name":"无","type":"无","remark":"无"}]', null, null, 0, 'GET', 1788196352006561794,
        '2024-05-09 11:15:06', '2024-05-09 20:11:44', 1);

