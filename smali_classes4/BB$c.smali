.class public final LBB$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTI4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBB;->k(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LTI4<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a8\u0006\u0010"
    }
    d2 = {
        "BB$c",
        "LTI4;",
        "Landroid/graphics/Bitmap;",
        "Lcom/bumptech/glide/load/engine/GlideException;",
        "e",
        "",
        "model",
        "LLY5;",
        "target",
        "",
        "isFirstResource",
        "a",
        "resource",
        "LZS0;",
        "dataSource",
        "b",
        "media_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LBB;

.field public final synthetic c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LBB;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, LBB$c;->b:LBB;

    iput-object p2, p0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    iput-wide p3, p0, LBB$c;->d:J

    iput-object p5, p0, LBB$c;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;LLY5;Z)Z
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "LLY5<",
            "Landroid/graphics/Bitmap;",
            ">;Z)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LBB$c;->b:LBB;

    invoke-static {v1}, LBB;->access$getAnalyticsManager$p(LBB;)LEa;

    move-result-object v1

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getName()Ljava/lang/String;

    move-result-object v8

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, LBB$c;->d:J

    sub-long/2addr v2, v4

    long-to-double v12, v2

    if-eqz p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/load/engine/GlideException;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to load Media: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v11, v2

    new-instance v2, LAK2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v10, v0, LBB$c;->e:Ljava/lang/String;

    const/4 v14, 0x7

    const/4 v15, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v15}, LAK2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v1, 0x0

    return v1
.end method

.method public b(Landroid/graphics/Bitmap;Ljava/lang/Object;LLY5;LZS0;Z)Z
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Object;",
            "LLY5<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "LZS0;",
            "Z)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LBB$c;->b:LBB;

    invoke-static {v1}, LBB;->access$getAnalyticsManager$p(LBB;)LEa;

    move-result-object v1

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getName()Ljava/lang/String;

    move-result-object v8

    iget-object v2, v0, LBB$c;->c:Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, LBB$c;->d:J

    sub-long/2addr v2, v4

    long-to-double v12, v2

    if-eqz p4, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, "unknown"

    :cond_1
    move-object v11, v2

    new-instance v2, LzK2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v10, v0, LBB$c;->e:Ljava/lang/String;

    const/4 v14, 0x7

    const/4 v15, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v15}, LzK2;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    const/4 v1, 0x0

    return v1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;LLY5;LZS0;Z)Z
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual/range {p0 .. p5}, LBB$c;->b(Landroid/graphics/Bitmap;Ljava/lang/Object;LLY5;LZS0;Z)Z

    move-result p1

    return p1
.end method
