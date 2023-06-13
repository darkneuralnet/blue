.class public final LjQ1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjQ1$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/IdToolOption;",
        "LiQ1;",
        "a",
        "servicecenter_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/IdToolOption;)LiQ1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LjQ1$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, LiQ1;->t:LiQ1;

    goto :goto_0

    :pswitch_1
    sget-object p0, LiQ1;->s:LiQ1;

    goto :goto_0

    :pswitch_2
    sget-object p0, LiQ1;->r:LiQ1;

    goto :goto_0

    :pswitch_3
    sget-object p0, LiQ1;->q:LiQ1;

    goto :goto_0

    :pswitch_4
    sget-object p0, LiQ1;->p:LiQ1;

    goto :goto_0

    :pswitch_5
    sget-object p0, LiQ1;->o:LiQ1;

    goto :goto_0

    :pswitch_6
    sget-object p0, LiQ1;->n:LiQ1;

    goto :goto_0

    :pswitch_7
    sget-object p0, LiQ1;->m:LiQ1;

    goto :goto_0

    :pswitch_8
    sget-object p0, LiQ1;->l:LiQ1;

    goto :goto_0

    :pswitch_9
    sget-object p0, LiQ1;->k:LiQ1;

    goto :goto_0

    :pswitch_a
    sget-object p0, LiQ1;->j:LiQ1;

    goto :goto_0

    :pswitch_b
    sget-object p0, LiQ1;->i:LiQ1;

    goto :goto_0

    :pswitch_c
    sget-object p0, LiQ1;->h:LiQ1;

    goto :goto_0

    :pswitch_d
    sget-object p0, LiQ1;->g:LiQ1;

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
