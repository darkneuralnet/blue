.class public final synthetic La25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La25;->b:Li25;

    iput-object p2, p0, La25;->c:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, La25;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, La25;->b:Li25;

    iget-object v1, p0, La25;->c:Lco/bird/android/model/wire/WireBird;

    iget-object v2, p0, La25;->d:Ljava/util/List;

    invoke-static {v0, v1, v2}, Li25;->c2(Li25;Lco/bird/android/model/wire/WireBird;Ljava/util/List;)V

    return-void
.end method
