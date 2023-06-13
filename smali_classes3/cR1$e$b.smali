.class public final LcR1$e$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcR1$e;->invoke(Lkotlin/Pair;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LcR1$e$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LnQ5$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LnQ5$b;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LnQ5$b;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LcR1;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:[Lco/bird/android/model/wire/WirePart;

.field public final synthetic j:Le13;


# direct methods
.method public constructor <init>(LcR1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Le13;)V
    .locals 0

    iput-object p1, p0, LcR1$e$b;->g:LcR1;

    iput-object p2, p0, LcR1$e$b;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LcR1$e$b;->i:[Lco/bird/android/model/wire/WirePart;

    iput-object p4, p0, LcR1$e$b;->j:Le13;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LnQ5$b;)V
    .locals 6

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, LcR1$e$b$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "repairs"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    iget-object v1, p0, LcR1$e$b;->j:Le13;

    invoke-interface {v1, v0, p1}, Le13;->C1(ILandroid/content/Intent;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LcR1$e$b;->j:Le13;

    invoke-interface {p1}, Le13;->e3()V

    iget-object v0, p0, LcR1$e$b;->j:Le13;

    iget-object p1, p0, LcR1$e$b;->g:LcR1;

    invoke-static {p1}, LcR1;->access$getOption(LcR1;)Lco/bird/android/model/IdToolOption;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Le13$a;->goToAssociateId$default(Le13;Lco/bird/android/model/IdToolOption;Lco/bird/android/model/wire/WireBird;ZILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LcR1$e$b;->g:LcR1;

    iget-object v0, p0, LcR1$e$b;->h:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, LcR1$e$b;->i:[Lco/bird/android/model/wire/WirePart;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lco/bird/android/model/wire/WirePart;

    invoke-static {p1, v0, v1}, LcR1;->access$attachParts(LcR1;Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;)V

    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LnQ5$b;

    invoke-virtual {p0, p1}, LcR1$e$b;->a(LnQ5$b;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
