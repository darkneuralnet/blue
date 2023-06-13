.class public final synthetic LmS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/model/BirdScan;

.field public final synthetic c:LgS;

.field public final synthetic d:Lco/bird/android/model/constant/ScanMode;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmS;->b:Lco/bird/android/model/BirdScan;

    iput-object p2, p0, LmS;->c:LgS;

    iput-object p3, p0, LmS;->d:Lco/bird/android/model/constant/ScanMode;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LmS;->b:Lco/bird/android/model/BirdScan;

    iget-object v1, p0, LmS;->c:LgS;

    iget-object v2, p0, LmS;->d:Lco/bird/android/model/constant/ScanMode;

    invoke-static {v0, v1, v2}, LgS$j;->a(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    return-object v0
.end method
