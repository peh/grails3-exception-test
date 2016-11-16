package error.test.app

class UrlMappings {

    static mappings = {
        "/"(controller: "home", action: "index")
        "500"(controller: "home", action: "error")
        "404"(view:'/notFound')
    }
}
