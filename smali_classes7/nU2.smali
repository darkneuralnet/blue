.class public final LnU2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LnU2;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LnU2;->b:Ljava/util/Map;

    const-string v0, "application/andrew-inset"

    const-string v1, "ez"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/dsptype"

    const-string v1, "tsp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/epub+zip"

    const-string v1, "epub"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/hta"

    const-string v1, "hta"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/mac-binhex40"

    const-string v1, "hqx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/mathematica"

    const-string v1, "nb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/msaccess"

    const-string v1, "mdb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/oda"

    const-string v1, "oda"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/ogg"

    const-string v1, "ogx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/pdf"

    const-string v1, "pdf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/pgp-keys"

    const-string v1, "key"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/pgp-signature"

    const-string v1, "pgp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/pics-rules"

    const-string v1, "prf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/pkix-cert"

    const-string v1, "cer"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/rar"

    const-string v1, "rar"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/rdf+xml"

    const-string v1, "rdf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/rss+xml"

    const-string v1, "rss"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/zip"

    const-string v1, "zip"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.android.package-archive"

    const-string v1, "apk"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.cinderella"

    const-string v1, "cdy"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.ms-pki.stl"

    const-string v1, "stl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.database"

    const-string v1, "odb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.formula"

    const-string v1, "odf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.graphics"

    const-string v1, "odg"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.graphics-template"

    const-string v1, "otg"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.image"

    const-string v1, "odi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.presentation"

    const-string v1, "odp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.presentation-template"

    const-string v1, "otp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.spreadsheet"

    const-string v1, "ods"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.spreadsheet-template"

    const-string v1, "ots"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.text"

    const-string v1, "odt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.text-master"

    const-string v1, "odm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.text-template"

    const-string v1, "ott"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.oasis.opendocument.text-web"

    const-string v1, "oth"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.google-earth.kml+xml"

    const-string v1, "kml"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.google-earth.kmz"

    const-string v1, "kmz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "doc"

    const-string v1, "application/msword"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dot"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.document"

    const-string v1, "docx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.wordprocessingml.template"

    const-string v1, "dotx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "xls"

    const-string v1, "application/vnd.ms-excel"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "xlt"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    const-string v1, "xlsx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.spreadsheetml.template"

    const-string v1, "xltx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ppt"

    const-string v1, "application/vnd.ms-powerpoint"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pot"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pps"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.presentation"

    const-string v1, "pptx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.template"

    const-string v1, "potx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.openxmlformats-officedocument.presentationml.slideshow"

    const-string v1, "ppsx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.rim.cod"

    const-string v1, "cod"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.smaf"

    const-string v1, "mmf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.calc"

    const-string v1, "sdc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.draw"

    const-string v1, "sda"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sdd"

    const-string v1, "application/vnd.stardivision.impress"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sdp"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.math"

    const-string v1, "smf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.writer"

    const-string v1, "sdw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.writer"

    const-string v1, "vor"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.stardivision.writer-global"

    const-string v1, "sgl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.calc"

    const-string v1, "sxc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.calc.template"

    const-string v1, "stc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.draw"

    const-string v1, "sxd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.draw.template"

    const-string v1, "std"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.impress"

    const-string v1, "sxi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.impress.template"

    const-string v1, "sti"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.math"

    const-string v1, "sxm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.writer"

    const-string v1, "sxw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.writer.global"

    const-string v1, "sxg"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.sun.xml.writer.template"

    const-string v1, "stw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/vnd.visio"

    const-string v1, "vsd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-abiword"

    const-string v1, "abw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-apple-diskimage"

    const-string v1, "dmg"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-bcpio"

    const-string v1, "bcpio"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-bittorrent"

    const-string v1, "torrent"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-cdf"

    const-string v1, "cdf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-cdlink"

    const-string v1, "vcd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-chess-pgn"

    const-string v1, "pgn"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-cpio"

    const-string v1, "cpio"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-debian-package"

    const-string v1, "deb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-debian-package"

    const-string v1, "udeb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dcr"

    const-string v1, "application/x-director"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dir"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dxr"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-dms"

    const-string v1, "dms"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-doom"

    const-string v1, "wad"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-dvi"

    const-string v1, "dvi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pfa"

    const-string v1, "application/x-font"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pfb"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gsf"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pcf"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pcf.Z"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-freemind"

    const-string v1, "mm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-futuresplash"

    const-string v1, "spl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/futuresplash"

    const-string v1, "spl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-gnumeric"

    const-string v1, "gnumeric"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-go-sgf"

    const-string v1, "sgf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-graphing-calculator"

    const-string v1, "gcf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "tgz"

    const-string v1, "application/x-gtar"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gtar"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "taz"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-hdf"

    const-string v1, "hdf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-hwp"

    const-string v1, "hwp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-ica"

    const-string v1, "ica"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-internet-signup"

    const-string v1, "ins"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-internet-signup"

    const-string v1, "isp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-iphone"

    const-string v1, "iii"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-iso9660-image"

    const-string v1, "iso"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-jmol"

    const-string v1, "jmz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kchart"

    const-string v1, "chrt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-killustrator"

    const-string v1, "kil"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "skp"

    const-string v1, "application/x-koan"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "skd"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "skt"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "skm"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kpresenter"

    const-string v1, "kpr"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kpresenter"

    const-string v1, "kpt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kspread"

    const-string v1, "ksp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kword"

    const-string v1, "kwd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-kword"

    const-string v1, "kwt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-latex"

    const-string v1, "latex"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-lha"

    const-string v1, "lha"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-lzh"

    const-string v1, "lzh"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-lzx"

    const-string v1, "lzx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "frm"

    const-string v1, "application/x-maker"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "maker"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "frame"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "fb"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "book"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "fbdoc"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-mif"

    const-string v1, "mif"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-ms-wmd"

    const-string v1, "wmd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-ms-wmz"

    const-string v1, "wmz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-msi"

    const-string v1, "msi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-ns-proxy-autoconfig"

    const-string v1, "pac"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-nwc"

    const-string v1, "nwc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-object"

    const-string v1, "o"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-oz-application"

    const-string v1, "oza"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-pem-file"

    const-string v1, "pem"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-pkcs12"

    const-string v1, "p12"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-pkcs12"

    const-string v1, "pfx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-pkcs7-certreqresp"

    const-string v1, "p7r"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-pkcs7-crl"

    const-string v1, "crl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-quicktimeplayer"

    const-string v1, "qtl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-shar"

    const-string v1, "shar"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-shockwave-flash"

    const-string v1, "swf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-stuffit"

    const-string v1, "sit"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-sv4cpio"

    const-string v1, "sv4cpio"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-sv4crc"

    const-string v1, "sv4crc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-tar"

    const-string v1, "tar"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-texinfo"

    const-string v1, "texinfo"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-texinfo"

    const-string v1, "texi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-troff"

    const-string v1, "t"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-troff"

    const-string v1, "roff"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-troff-man"

    const-string v1, "man"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-ustar"

    const-string v1, "ustar"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-wais-source"

    const-string v1, "src"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-wingz"

    const-string v1, "wz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-webarchive"

    const-string v1, "webarchive"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-webarchive-xml"

    const-string v1, "webarchivexml"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-x509-ca-cert"

    const-string v1, "crt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-x509-user-cert"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-x509-server-cert"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-xcf"

    const-string v1, "xcf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-xfig"

    const-string v1, "fig"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/xhtml+xml"

    const-string v1, "xhtml"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/3gpp"

    const-string v1, "3gpp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/3gpp"

    const-string v1, "3gp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/3gpp2"

    const-string v1, "3gpp2"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/3gpp2"

    const-string v1, "3g2"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/3gpp"

    const-string v1, "3gpp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/aac"

    const-string v1, "aac"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/aac-adts"

    const-string v1, "aac"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/amr"

    const-string v1, "amr"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/amr-wb"

    const-string v1, "awb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/basic"

    const-string v1, "snd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/flac"

    const-string v1, "flac"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "application/x-flac"

    const-string v1, "flac"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/imelody"

    const-string v1, "imy"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mid"

    const-string v1, "audio/midi"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "midi"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ota"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "kar"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "rtttl"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "xmf"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/mobile-xmf"

    const-string v1, "mxmf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mp3"

    const-string v1, "audio/mpeg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mpga"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mpega"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mp2"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "m4a"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/mpegurl"

    const-string v1, "m3u"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "oga"

    const-string v1, "audio/ogg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ogg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "spx"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/prs.sid"

    const-string v1, "sid"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "aif"

    const-string v1, "audio/x-aiff"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "aiff"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "aifc"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-gsm"

    const-string v1, "gsm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-matroska"

    const-string v1, "mka"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-mpegurl"

    const-string v1, "m3u"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-ms-wma"

    const-string v1, "wma"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-ms-wax"

    const-string v1, "wax"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ra"

    const-string v1, "audio/x-pn-realaudio"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "rm"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ram"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-realaudio"

    const-string v1, "ra"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-scpls"

    const-string v1, "pls"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-sd2"

    const-string v1, "sd2"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "audio/x-wav"

    const-string v1, "wav"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-ms-bmp"

    const-string v1, "bmp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/bmp"

    const-string v1, "bmp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/gif"

    const-string v1, "gif"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-icon"

    const-string v1, "ico"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/ico"

    const-string v1, "cur"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/ico"

    const-string v1, "ico"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/ief"

    const-string v1, "ief"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "jpg"

    const-string v1, "image/jpeg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "jpeg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "jpe"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/pcx"

    const-string v1, "pcx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/png"

    const-string v1, "png"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/svg+xml"

    const-string v1, "svg"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/svg+xml"

    const-string v1, "svgz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/tiff"

    const-string v1, "tiff"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/tiff"

    const-string v1, "tif"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/vnd.djvu"

    const-string v1, "djvu"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/vnd.djvu"

    const-string v1, "djv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/vnd.wap.wbmp"

    const-string v1, "wbmp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/webp"

    const-string v1, "webp"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-adobe-dng"

    const-string v1, "dng"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-canon-cr2"

    const-string v1, "cr2"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-cmu-raster"

    const-string v1, "ras"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-coreldraw"

    const-string v1, "cdr"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-coreldrawpattern"

    const-string v1, "pat"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-coreldrawtemplate"

    const-string v1, "cdt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-corelphotopaint"

    const-string v1, "cpt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-fuji-raf"

    const-string v1, "raf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-jg"

    const-string v1, "art"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-jng"

    const-string v1, "jng"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-nikon-nef"

    const-string v1, "nef"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-nikon-nrw"

    const-string v1, "nrw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-olympus-orf"

    const-string v1, "orf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-panasonic-rw2"

    const-string v1, "rw2"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-pentax-pef"

    const-string v1, "pef"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-photoshop"

    const-string v1, "psd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-portable-anymap"

    const-string v1, "pnm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-portable-bitmap"

    const-string v1, "pbm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-portable-graymap"

    const-string v1, "pgm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-portable-pixmap"

    const-string v1, "ppm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-samsung-srw"

    const-string v1, "srw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-sony-arw"

    const-string v1, "arw"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-rgb"

    const-string v1, "rgb"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-xbitmap"

    const-string v1, "xbm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-xpixmap"

    const-string v1, "xpm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "image/x-xwindowdump"

    const-string v1, "xwd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "model/iges"

    const-string v1, "igs"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "model/iges"

    const-string v1, "iges"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "msh"

    const-string v1, "model/mesh"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mesh"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "silo"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/calendar"

    const-string v1, "ics"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/calendar"

    const-string v1, "icz"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/comma-separated-values"

    const-string v1, "csv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/css"

    const-string v1, "css"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/html"

    const-string v1, "htm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/html"

    const-string v1, "html"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/h323"

    const-string v1, "323"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/iuls"

    const-string v1, "uls"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/mathml"

    const-string v1, "mml"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "txt"

    const-string v1, "text/plain"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "asc"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "po"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/richtext"

    const-string v1, "rtx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/rtf"

    const-string v1, "rtf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/text"

    const-string v1, "phps"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/tab-separated-values"

    const-string v1, "tsv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/xml"

    const-string v1, "xml"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-bibtex"

    const-string v1, "bib"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-boo"

    const-string v1, "boo"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hpp"

    const-string v1, "text/x-c++hdr"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "h++"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hxx"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hh"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cpp"

    const-string v1, "text/x-c++src"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "c++"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cc"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cxx"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-chdr"

    const-string v1, "h"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-component"

    const-string v1, "htc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-csh"

    const-string v1, "csh"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-csrc"

    const-string v1, "c"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-dsrc"

    const-string v1, "d"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-haskell"

    const-string v1, "hs"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-java"

    const-string v1, "java"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-literate-haskell"

    const-string v1, "lhs"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-moc"

    const-string v1, "moc"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-pascal"

    const-string v1, "p"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-pascal"

    const-string v1, "pas"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-pcs-gcd"

    const-string v1, "gcd"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-setext"

    const-string v1, "etx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-tcl"

    const-string v1, "tcl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "tex"

    const-string v1, "text/x-tex"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ltx"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sty"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cls"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-vcalendar"

    const-string v1, "vcs"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "text/x-vcard"

    const-string v1, "vcf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/avi"

    const-string v1, "avi"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/dl"

    const-string v1, "dl"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/dv"

    const-string v1, "dif"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/dv"

    const-string v1, "dv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/fli"

    const-string v1, "fli"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/m4v"

    const-string v1, "m4v"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/mp2ts"

    const-string v1, "ts"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mpeg"

    const-string v1, "video/mpeg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mpg"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mpe"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/mp4"

    const-string v2, "mp4"

    invoke-static {v0, v2}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "VOB"

    invoke-static {v1, v0}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/ogg"

    const-string v1, "ogv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/quicktime"

    const-string v1, "qt"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/quicktime"

    const-string v1, "mov"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/vnd.mpegurl"

    const-string v1, "mxu"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/webm"

    const-string v1, "webm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-la-asf"

    const-string v1, "lsf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-la-asf"

    const-string v1, "lsx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-matroska"

    const-string v1, "mkv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-mng"

    const-string v1, "mng"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-asf"

    const-string v1, "asf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-asf"

    const-string v1, "asx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-wm"

    const-string v1, "wm"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-wmv"

    const-string v1, "wmv"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-wmx"

    const-string v1, "wmx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-ms-wvx"

    const-string v1, "wvx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-sgi-movie"

    const-string v1, "movie"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "video/x-webex"

    const-string v1, "wrf"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "x-conference/x-cooltalk"

    const-string v1, "ice"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "x-epoc/x-sisx-app"

    const-string v1, "sisx"

    invoke-static {v0, v1}, LnU2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, LnU2;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, LnU2;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, LnU2;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
