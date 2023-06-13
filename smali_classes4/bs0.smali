.class public final synthetic Lbs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcs0;

.field public final synthetic c:Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;


# direct methods
.method public synthetic constructor <init>(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs0;->b:Lcs0;

    iput-object p2, p0, Lbs0;->c:Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbs0;->b:Lcs0;

    iget-object v1, p0, Lbs0;->c:Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;

    invoke-static {v0, v1}, Lcs0$a;->a(Lcs0;Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method
