.class public final Lql0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/widget/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lql0$a;",
        "Lco/bird/android/widget/d;",
        "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;",
        "b",
        "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;",
        "f",
        "()Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;",
        "reason",
        "",
        "c",
        "Ljava/lang/String;",
        "e",
        "()Ljava/lang/String;",
        "textString",
        "<init>",
        "(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql0$a;->b:Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;->getTitle()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lql0$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->i(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->a(Lco/bird/android/widget/d;)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->e(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->f(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lql0$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;
    .locals 1

    iget-object v0, p0, Lql0$a;->b:Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->h(Lco/bird/android/widget/d;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getColor()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->b(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getIcon()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->c(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->d(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/lang/Integer;
    .locals 1

    invoke-static {p0}, Lco/bird/android/widget/d$a;->g(Lco/bird/android/widget/d;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
