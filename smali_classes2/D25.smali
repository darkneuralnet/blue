.class public final synthetic LD25;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Lco/bird/android/model/wire/WireBird;

.field public final synthetic d:Landroid/location/Location;


# direct methods
.method public synthetic constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD25;->b:Li25;

    iput-object p2, p0, LD25;->c:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LD25;->d:Landroid/location/Location;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LD25;->b:Li25;

    iget-object v1, p0, LD25;->c:Lco/bird/android/model/wire/WireBird;

    iget-object v2, p0, LD25;->d:Landroid/location/Location;

    invoke-static {v0, v1, v2}, Li25$q2;->a(Li25;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V

    return-void
.end method
