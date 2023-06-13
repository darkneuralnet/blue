.class public final synthetic LhE6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LkE6;

.field public final synthetic c:Lco/bird/android/model/BirdSummaryBody;

.field public final synthetic d:Lco/bird/android/model/MobilePartner;

.field public final synthetic e:Ljava/util/Map;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhE6;->b:LkE6;

    iput-object p2, p0, LhE6;->c:Lco/bird/android/model/BirdSummaryBody;

    iput-object p3, p0, LhE6;->d:Lco/bird/android/model/MobilePartner;

    iput-object p4, p0, LhE6;->e:Ljava/util/Map;

    iput-object p5, p0, LhE6;->f:Ljava/util/List;

    iput-object p6, p0, LhE6;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LhE6;->b:LkE6;

    iget-object v1, p0, LhE6;->c:Lco/bird/android/model/BirdSummaryBody;

    iget-object v2, p0, LhE6;->d:Lco/bird/android/model/MobilePartner;

    iget-object v3, p0, LhE6;->e:Ljava/util/Map;

    iget-object v4, p0, LhE6;->f:Ljava/util/List;

    iget-object v5, p0, LhE6;->g:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, LkE6;->r(LkE6;Lco/bird/android/model/BirdSummaryBody;Lco/bird/android/model/MobilePartner;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
