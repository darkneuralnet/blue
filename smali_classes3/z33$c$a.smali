.class public final Lz33$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz33$c;->a(Lco/bird/android/model/wire/WireFlagNestReason;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LB33;",
        "LB33;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LB33;",
        "state",
        "a",
        "(LB33;)LB33;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireFlagNestReason;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireFlagNestReason;)V
    .locals 0

    iput-object p1, p0, Lz33$c$a;->g:Lco/bird/android/model/wire/WireFlagNestReason;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB33;)LB33;
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iget-object v3, p0, Lz33$c$a;->g:Lco/bird/android/model/wire/WireFlagNestReason;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LB33;->copy$default(LB33;Ljava/util/List;Lco/bird/android/model/wire/WireFlagNestReason;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)LB33;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB33;

    invoke-virtual {p0, p1}, Lz33$c$a;->a(LB33;)LB33;

    move-result-object p1

    return-object p1
.end method
