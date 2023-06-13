.class public LoM2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/g;


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
        "Lio/reactivex/functions/g<",
        "LBy0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LoM2;


# direct methods
.method public constructor <init>(LoM2;)V
    .locals 0

    iput-object p1, p0, LoM2$b;->b:LoM2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBy0;)V
    .locals 1

    iget-object v0, p0, LoM2$b;->b:LoM2;

    invoke-static {v0, p1}, LoM2;->c(LoM2;LBy0;)LBy0;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, LBy0;

    invoke-virtual {p0, p1}, LoM2$b;->a(LBy0;)V

    return-void
.end method
