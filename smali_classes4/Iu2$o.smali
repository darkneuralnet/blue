.class public final LIu2$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIu2;->h(Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LNo;",
        "LNo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LNo;",
        "asset",
        "kotlin.jvm.PlatformType",
        "a",
        "(LNo;)LNo;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/constant/AssetManagerType;

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lorg/joda/time/DateTime;

.field public final synthetic m:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/AssetManagerType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V
    .locals 0

    iput-object p1, p0, LIu2$o;->g:Lco/bird/android/model/constant/AssetManagerType;

    iput-wide p2, p0, LIu2$o;->h:J

    iput-object p4, p0, LIu2$o;->i:Ljava/lang/String;

    iput-object p5, p0, LIu2$o;->j:Ljava/lang/String;

    iput-object p6, p0, LIu2$o;->k:Ljava/lang/String;

    iput-object p7, p0, LIu2$o;->l:Lorg/joda/time/DateTime;

    iput-object p8, p0, LIu2$o;->m:Lorg/joda/time/DateTime;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LNo;)LNo;
    .locals 13

    const-string v0, "asset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iget-object v0, p0, LIu2$o;->g:Lco/bird/android/model/constant/AssetManagerType;

    if-nez v0, :cond_0

    invoke-virtual {p1}, LNo;->h()Lco/bird/android/model/constant/AssetManagerType;

    move-result-object v0

    :cond_0
    move-object v3, v0

    iget-wide v0, p0, LIu2$o;->h:J

    const-wide/16 v4, 0x0

    cmp-long v4, v0, v4

    if-lez v4, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LNo;->f()Ljava/lang/Long;

    move-result-object v0

    :goto_0
    move-object v4, v0

    iget-object v0, p0, LIu2$o;->i:Ljava/lang/String;

    if-nez v0, :cond_2

    invoke-virtual {p1}, LNo;->j()Ljava/lang/String;

    move-result-object v0

    :cond_2
    move-object v5, v0

    iget-object v0, p0, LIu2$o;->j:Ljava/lang/String;

    if-nez v0, :cond_3

    invoke-virtual {p1}, LNo;->e()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v6, v0

    iget-object v0, p0, LIu2$o;->k:Ljava/lang/String;

    if-nez v0, :cond_4

    invoke-virtual {p1}, LNo;->b()Ljava/lang/String;

    move-result-object v0

    :cond_4
    move-object v7, v0

    iget-object v0, p0, LIu2$o;->l:Lorg/joda/time/DateTime;

    if-nez v0, :cond_5

    invoke-virtual {p1}, LNo;->d()Lorg/joda/time/DateTime;

    move-result-object v0

    :cond_5
    move-object v8, v0

    iget-object v0, p0, LIu2$o;->m:Lorg/joda/time/DateTime;

    if-nez v0, :cond_6

    invoke-virtual {p1}, LNo;->i()Lorg/joda/time/DateTime;

    move-result-object v0

    :cond_6
    move-object v9, v0

    const/4 v10, 0x0

    const/16 v11, 0x101

    const/4 v12, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v12}, LNo;->copy$default(LNo;Ljava/lang/String;Lco/bird/android/model/constant/AssetManagerType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)LNo;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LNo;

    invoke-virtual {p0, p1}, LIu2$o;->a(LNo;)LNo;

    move-result-object p1

    return-object p1
.end method
