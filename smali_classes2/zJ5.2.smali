.class public final synthetic LzJ5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic c:LXl5;

.field public final synthetic d:LTk5;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzJ5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p2, p0, LzJ5;->c:LXl5;

    iput-object p3, p0, LzJ5;->d:LTk5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LzJ5;->b:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, LzJ5;->c:LXl5;

    iget-object v2, p0, LzJ5;->d:LTk5;

    invoke-static {v0, v1, v2}, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->a(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V

    return-void
.end method
