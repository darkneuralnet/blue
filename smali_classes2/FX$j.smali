.class public final LFX$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFX;-><init>(Lde5;LaX;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFX$j$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LWX;",
        "LEu1<",
        "+",
        "LZ21<",
        "LYl5;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LWX;",
        "opSettings",
        "LEu1;",
        "LZ21;",
        "LYl5;",
        "a",
        "(LWX;)LEu1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LFX;


# direct methods
.method public constructor <init>(LFX;)V
    .locals 0

    iput-object p1, p0, LFX$j;->g:LFX;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LWX;)LEu1;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWX;",
            ")",
            "LEu1<",
            "LZ21<",
            "LYl5;",
            ">;>;"
        }
    .end annotation

    const-string v0, "opSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LWX;->a()Lbi3;

    move-result-object v0

    instance-of v1, p1, LYk5;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, LYk5;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, LYk5;->d()Lno/nordicsemi/android/support/v18/scanner/ScanFilter;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lno/nordicsemi/android/support/v18/scanner/ScanFilter;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "operating mode change: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {p1}, LWX;->a()Lbi3;

    move-result-object v0

    sget-object v1, LFX$j$d;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, LN93;

    invoke-direct {v0, p1}, LN93;-><init>(LWX;)V

    invoke-static {v0}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object p1

    goto :goto_2

    :pswitch_1
    new-instance v0, LFX$j$a;

    iget-object v1, p0, LFX$j;->g:LFX;

    invoke-direct {v0, p1, v1, v2}, LFX$j$a;-><init>(LWX;LFX;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0}, LVu1;->e(Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p1

    new-instance v0, LFX$j$b;

    invoke-direct {v0, v2}, LFX$j$b;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0}, LVu1;->M(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p1

    new-instance v0, LFX$j$c;

    invoke-direct {v0, v2}, LFX$j$c;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0}, LVu1;->K(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object p1

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWX;

    invoke-virtual {p0, p1}, LFX$j;->a(LWX;)LEu1;

    move-result-object p1

    return-object p1
.end method
