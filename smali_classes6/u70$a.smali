.class public Lu70$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu70;->a(Ljava/util/UUID;)Lio/reactivex/functions/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/q<",
        "Lt70<",
        "Ljava/util/UUID;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lu70$a;->b:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt70;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt70<",
            "Ljava/util/UUID;",
            ">;)Z"
        }
    .end annotation

    iget-object p1, p1, Lt70;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/UUID;

    iget-object v0, p0, Lu70$a;->b:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lt70;

    invoke-virtual {p0, p1}, Lu70$a;->a(Lt70;)Z

    move-result p1

    return p1
.end method
