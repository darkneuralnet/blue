.class public final synthetic LPm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LPm6;->b:Z

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, LPm6;->b:Z

    invoke-static {v0}, Lco/bird/android/manager/bluetooth/internal/d;->z(Z)Lco/bird/android/model/Command;

    move-result-object v0

    return-object v0
.end method
