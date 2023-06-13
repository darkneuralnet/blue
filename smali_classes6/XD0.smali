.class public final synthetic LXD0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LgZ0$a;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lcom/google/firebase/crashlytics/internal/model/StaticSessionData;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLcom/google/firebase/crashlytics/internal/model/StaticSessionData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXD0;->a:Ljava/lang/String;

    iput-object p2, p0, LXD0;->b:Ljava/lang/String;

    iput-wide p3, p0, LXD0;->c:J

    iput-object p5, p0, LXD0;->d:Lcom/google/firebase/crashlytics/internal/model/StaticSessionData;

    return-void
.end method


# virtual methods
.method public final a(LX94;)V
    .locals 6

    iget-object v0, p0, LXD0;->a:Ljava/lang/String;

    iget-object v1, p0, LXD0;->b:Ljava/lang/String;

    iget-wide v2, p0, LXD0;->c:J

    iget-object v4, p0, LXD0;->d:Lcom/google/firebase/crashlytics/internal/model/StaticSessionData;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/crashlytics/internal/CrashlyticsNativeComponentDeferredProxy;->b(Ljava/lang/String;Ljava/lang/String;JLcom/google/firebase/crashlytics/internal/model/StaticSessionData;LX94;)V

    return-void
.end method
