.class public final synthetic LKo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:LLo0;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public synthetic constructor <init>(LLo0;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKo0;->b:LLo0;

    iput-object p2, p0, LKo0;->c:Lco/bird/android/model/wire/WireBird;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LKo0;->b:LLo0;

    iget-object v1, p0, LKo0;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0, v1}, LLo0;->r(LLo0;Lco/bird/android/model/wire/WireBird;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
