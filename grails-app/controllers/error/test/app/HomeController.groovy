package error.test.app

class HomeController {

    def index() {
        render "THIS IS OKAY\n"
        1 / 0
    }

    def error() {
        render "THIS IS THE ERROR"
    }
}
