.class public final LWJ2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWJ2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Landroidx/lifecycle/f$a;",
        "LtK2;",
        "a",
        "rx_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Landroidx/lifecycle/f$a;)LtK2;
    .locals 1

    sget-object v0, LWJ2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    const/4 p0, 0x0

    goto :goto_0

    :pswitch_1
    sget-object p0, LtK2;->h:LtK2;

    goto :goto_0

    :pswitch_2
    sget-object p0, LtK2;->g:LtK2;

    goto :goto_0

    :pswitch_3
    sget-object p0, LtK2;->f:LtK2;

    goto :goto_0

    :pswitch_4
    sget-object p0, LtK2;->e:LtK2;

    goto :goto_0

    :pswitch_5
    sget-object p0, LtK2;->d:LtK2;

    goto :goto_0

    :pswitch_6
    sget-object p0, LtK2;->b:LtK2;

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic access$toMapLifecycleEvent(Landroidx/lifecycle/f$a;)LtK2;
    .locals 0

    invoke-static {p0}, LWJ2;->a(Landroidx/lifecycle/f$a;)LtK2;

    move-result-object p0

    return-object p0
.end method
