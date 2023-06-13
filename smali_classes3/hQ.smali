.class public final synthetic LhQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/birdplus/v1/details/a;

.field public final synthetic c:Lco/bird/android/model/persistence/BirdPlusView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhQ;->b:Lco/bird/android/feature/birdplus/v1/details/a;

    iput-object p2, p0, LhQ;->c:Lco/bird/android/model/persistence/BirdPlusView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LhQ;->b:Lco/bird/android/feature/birdplus/v1/details/a;

    iget-object v1, p0, LhQ;->c:Lco/bird/android/model/persistence/BirdPlusView;

    invoke-static {v0, v1}, Lco/bird/android/feature/birdplus/v1/details/a$i$b;->c(Lco/bird/android/feature/birdplus/v1/details/a;Lco/bird/android/model/persistence/BirdPlusView;)V

    return-void
.end method
