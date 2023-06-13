.class public final synthetic LCo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LAo0;

.field public final synthetic c:Lco/bird/android/model/VehicleCommand;


# direct methods
.method public synthetic constructor <init>(LAo0;Lco/bird/android/model/VehicleCommand;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCo0;->b:LAo0;

    iput-object p2, p0, LCo0;->c:Lco/bird/android/model/VehicleCommand;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LCo0;->b:LAo0;

    iget-object v1, p0, LCo0;->c:Lco/bird/android/model/VehicleCommand;

    invoke-static {v0, v1}, LAo0$a$d;->d(LAo0;Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method
