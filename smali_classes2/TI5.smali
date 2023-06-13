.class public final synthetic LTI5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/app/manager/SmartlockManagerImpl;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LTI5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->y(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    return-void
.end method
