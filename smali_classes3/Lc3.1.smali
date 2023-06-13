.class public final synthetic LLc3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LKc3;

.field public final synthetic c:Lco/bird/android/model/persistence/Notification;

.field public final synthetic d:Lco/bird/android/model/persistence/nestedstructures/NotificationAction;


# direct methods
.method public synthetic constructor <init>(LKc3;Lco/bird/android/model/persistence/Notification;Lco/bird/android/model/persistence/nestedstructures/NotificationAction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLc3;->b:LKc3;

    iput-object p2, p0, LLc3;->c:Lco/bird/android/model/persistence/Notification;

    iput-object p3, p0, LLc3;->d:Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LLc3;->b:LKc3;

    iget-object v1, p0, LLc3;->c:Lco/bird/android/model/persistence/Notification;

    iget-object v2, p0, LLc3;->d:Lco/bird/android/model/persistence/nestedstructures/NotificationAction;

    invoke-static {v0, v1, v2}, LKc3$d;->a(LKc3;Lco/bird/android/model/persistence/Notification;Lco/bird/android/model/persistence/nestedstructures/NotificationAction;)V

    return-void
.end method
