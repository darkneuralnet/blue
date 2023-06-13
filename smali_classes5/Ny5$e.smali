.class public final LNy5$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNy5;->h(Lcom/facebook/share/model/SharePhotoContent;Ljava/util/UUID;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyi6$b<",
        "LrY2$a;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LrY2$a;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, LrY2$a;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LrY2$a;

    invoke-virtual {p0, p1}, LNy5$e;->a(LrY2$a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
