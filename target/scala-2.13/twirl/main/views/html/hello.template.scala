
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(name:String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Hello")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
"""),format.raw/*5.1*/("""<section id="top">
  <div class="wrapper">
    <h1>Hello """),_display_(/*7.16*/name),format.raw/*7.20*/("""</h1>
  </div>
</section>
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(name:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(name)(assetsFinder)

  def f:((String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (name) => (assetsFinder) => apply(name)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/hello.scala.html
                  HASH: 9891b776866faaff952fbbd895ba3db6081cd602
                  MATRIX: 742->2|886->53|913->55|934->68|973->70|1000->71|1084->129|1108->133|1165->160
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|30->7|30->7|33->10
                  -- GENERATED --
              */
          