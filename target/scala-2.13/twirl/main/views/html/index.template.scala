
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit assetFinder:AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("BE Polite")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),format.raw/*4.3*/("""<h1>id</h1>
""")))}),format.raw/*5.2*/("""

"""))
      }
    }
  }

  def render(assetFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(assetFinder)

  def f:(() => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (assetFinder) => apply()(assetFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 463c9b777e81f3630dcb2e8511bd90706a927399
                  MATRIX: 735->1|866->39|893->41|918->58|957->60|986->63|1028->76
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|29->5
                  -- GENERATED --
              */
          