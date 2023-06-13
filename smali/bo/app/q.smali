.class public final Lbo/app/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/q$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0011\u0010\u0008\u001a\u00020\u00058G\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011"
    }
    d2 = {
        "Lbo/app/q;",
        "",
        "",
        "b",
        "c",
        "",
        "a",
        "()Z",
        "isNewMessagingSessionCriteriaMet",
        "Landroid/content/Context;",
        "applicationContext",
        "Lbo/app/g2;",
        "eventPublisher",
        "Lbo/app/a5;",
        "serverConfigStorageProvider",
        "<init>",
        "(Landroid/content/Context;Lbo/app/g2;Lbo/app/a5;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final e:Lbo/app/q$a;


# instance fields
.field private final a:Lbo/app/g2;

.field private final b:Lbo/app/a5;

.field public final c:Landroid/content/SharedPreferences;

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/q$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/q;->e:Lbo/app/q$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbo/app/g2;Lbo/app/a5;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventPublisher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverConfigStorageProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lbo/app/q;->a:Lbo/app/g2;

    iput-object p3, p0, Lbo/app/q;->b:Lbo/app/a5;

    const-string p2, "com.appboy.storage.sessions.messaging_session"

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lbo/app/q;->c:Landroid/content/SharedPreferences;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 17

    move-object/from16 v8, p0

    iget-object v0, v8, Lbo/app/q;->b:Lbo/app/a5;

    invoke-virtual {v0}, Lbo/app/a5;->g()J

    move-result-wide v9

    const-wide/16 v0, -0x1

    cmp-long v2, v9, v0

    const/4 v11, 0x0

    if-eqz v2, :cond_0

    iget-boolean v2, v8, Lbo/app/q;->d:Z

    if-nez v2, :cond_0

    iget-object v2, v8, Lbo/app/q;->c:Landroid/content/SharedPreferences;

    const-string v3, "messaging_session_timestamp"

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    invoke-static {}, LoT0;->i()J

    move-result-wide v14

    sget-object v0, Lk20;->a:Lk20;

    new-instance v16, Lbo/app/q$b;

    move-object/from16 v1, v16

    move-wide v2, v9

    move-wide v4, v14

    move-wide v6, v12

    invoke-direct/range {v1 .. v7}, Lbo/app/q$b;-><init>(JJJ)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    add-long/2addr v12, v9

    cmp-long v0, v12, v14

    if-gez v0, :cond_0

    const/4 v11, 0x1

    :cond_0
    return v11
.end method

.method public final b()V
    .locals 9

    invoke-virtual {p0}, Lbo/app/q;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/q$c;->b:Lbo/app/q$c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/q;->a:Lbo/app/g2;

    sget-object v1, Lbo/app/k3;->b:Lbo/app/k3;

    const-class v2, Lbo/app/k3;

    invoke-interface {v0, v1, v2}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbo/app/q;->d:Z

    goto :goto_0

    :cond_0
    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/q$d;->b:Lbo/app/q$d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final c()V
    .locals 10

    invoke-static {}, LoT0;->i()J

    move-result-wide v0

    sget-object v2, Lk20;->a:Lk20;

    new-instance v7, Lbo/app/q$e;

    invoke-direct {v7, v0, v1}, Lbo/app/q$e;-><init>(J)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v2, p0, Lbo/app/q;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "messaging_session_timestamp"

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbo/app/q;->d:Z

    return-void
.end method
