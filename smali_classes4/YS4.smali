.class public final synthetic LYS4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LIT4;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lco/bird/android/model/RideState$Status;


# direct methods
.method public synthetic constructor <init>(LIT4;Ljava/lang/String;Lco/bird/android/model/RideState$Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYS4;->b:LIT4;

    iput-object p2, p0, LYS4;->c:Ljava/lang/String;

    iput-object p3, p0, LYS4;->d:Lco/bird/android/model/RideState$Status;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LYS4;->b:LIT4;

    iget-object v1, p0, LYS4;->c:Ljava/lang/String;

    iget-object v2, p0, LYS4;->d:Lco/bird/android/model/RideState$Status;

    invoke-static {v0, v1, v2}, LIT4;->S2(LIT4;Ljava/lang/String;Lco/bird/android/model/RideState$Status;)V

    return-void
.end method
