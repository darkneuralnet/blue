.class public final synthetic LZ00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LY00;

.field public final synthetic c:[Lco/bird/android/model/persistence/BountyMapMarker;


# direct methods
.method public synthetic constructor <init>(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ00;->b:LY00;

    iput-object p2, p0, LZ00;->c:[Lco/bird/android/model/persistence/BountyMapMarker;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZ00;->b:LY00;

    iget-object v1, p0, LZ00;->c:[Lco/bird/android/model/persistence/BountyMapMarker;

    invoke-static {v0, v1}, LY00$b;->a(LY00;[Lco/bird/android/model/persistence/BountyMapMarker;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
