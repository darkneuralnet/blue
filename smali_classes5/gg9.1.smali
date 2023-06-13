.class public final Lgg9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:LYw7;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:LWe9;

.field public final d:LZy5;

.field public final e:Lcom/google/android/gms/tasks/Task;

.field public final f:Lcom/google/android/gms/tasks/Task;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Ljava/util/Map;

.field public final j:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "optional-module-barcode"

    const-string v1, "com.google.android.gms.vision.barcode"

    invoke-static {v0, v1}, LYw7;->c(Ljava/lang/Object;Ljava/lang/Object;)LYw7;

    move-result-object v0

    sput-object v0, Lgg9;->k:LYw7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LZy5;LWe9;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lgg9;->i:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lgg9;->j:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lgg9;->a:Ljava/lang/String;

    invoke-static {p1}, LCp0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lgg9;->b:Ljava/lang/String;

    iput-object p2, p0, Lgg9;->d:LZy5;

    iput-object p3, p0, Lgg9;->c:LWe9;

    invoke-static {}, LKi9;->a()LKi9;

    iput-object p4, p0, Lgg9;->g:Ljava/lang/String;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    new-instance v0, LCf9;

    invoke-direct {v0, p0}, LCf9;-><init>(Lgg9;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    iput-object p3, p0, Lgg9;->e:Lcom/google/android/gms/tasks/Task;

    invoke-static {}, LME2;->a()LME2;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, LKf9;

    invoke-direct {v0, p2}, LKf9;-><init>(LZy5;)V

    invoke-virtual {p3, v0}, LME2;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    iput-object p2, p0, Lgg9;->f:Lcom/google/android/gms/tasks/Task;

    sget-object p2, Lgg9;->k:LYw7;

    invoke-virtual {p2, p4}, LYw7;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2, p4}, LYw7;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Lgg9;->h:I

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/common/internal/LibraryVersion;->getInstance()Lcom/google/android/gms/common/internal/LibraryVersion;

    move-result-object v0

    iget-object v1, p0, Lgg9;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/LibraryVersion;->getVersion(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
