.class public LoM2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoM2;->a(Landroid/content/Context;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "LBy0;",
        "Lna4<",
        "LBy0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LoM2;


# direct methods
.method public constructor <init>(LoM2;)V
    .locals 0

    iput-object p1, p0, LoM2$a;->b:LoM2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBy0;)Lna4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBy0;",
            ")",
            "Lna4<",
            "LBy0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LoM2$a;->b:LoM2;

    invoke-static {v0}, LoM2;->b(LoM2;)LBy0;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LoM2;->i(LBy0;LBy0;)Lna4;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, LBy0;

    invoke-virtual {p0, p1}, LoM2$a;->a(LBy0;)Lna4;

    move-result-object p1

    return-object p1
.end method
