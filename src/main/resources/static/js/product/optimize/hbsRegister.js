var config = {contentHost: 'http://img2.memebox.com', contentPath: '/static/contents/img/upload/'}
Handlebars.registerHelper('dealThumbnail', function (data) {
    var obj = JSON.parse(data);
    return config.contentHost + config.contentPath + obj.thumbnail[0];
});