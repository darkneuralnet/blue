.class public final LIE3$o;
.super LIE3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIE3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LIE3<",
        "Lokhttp3/MultipartBody$Part;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:LIE3$o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LIE3$o;

    invoke-direct {v0}, LIE3$o;-><init>()V

    sput-object v0, LIE3$o;->a:LIE3$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIE3;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LsI4;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lokhttp3/MultipartBody$Part;

    invoke-virtual {p0, p1, p2}, LIE3$o;->d(LsI4;Lokhttp3/MultipartBody$Part;)V

    return-void
.end method

.method public d(LsI4;Lokhttp3/MultipartBody$Part;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, LsI4;->e(Lokhttp3/MultipartBody$Part;)V

    :cond_0
    return-void
.end method
