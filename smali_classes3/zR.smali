.class public final synthetic LzR;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lnn4;

.field public final synthetic c:Lco/bird/android/model/persistence/BirdRatingHistory;


# direct methods
.method public synthetic constructor <init>(Lnn4;Lco/bird/android/model/persistence/BirdRatingHistory;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzR;->b:Lnn4;

    iput-object p2, p0, LzR;->c:Lco/bird/android/model/persistence/BirdRatingHistory;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LzR;->b:Lnn4;

    iget-object v1, p0, LzR;->c:Lco/bird/android/model/persistence/BirdRatingHistory;

    invoke-static {v0, v1}, LAR;->a(Lnn4;Lco/bird/android/model/persistence/BirdRatingHistory;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
