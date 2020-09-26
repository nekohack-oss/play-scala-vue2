package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(
                                assets: Assets
                              ) extends Controller {

  /**
   * プロダクション時のみ
   * @return
   */
  def index() = assets.at(path = "/public", file = "vue-dist/index.html")

}
