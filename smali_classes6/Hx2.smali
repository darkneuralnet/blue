.class public LHx2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LHx2;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LHx2;

    const-string v1, "FirebaseAppCheck"

    invoke-direct {v0, v1}, LHx2;-><init>(Ljava/lang/String;)V

    sput-object v0, LHx2;->c:LHx2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHx2;->a:Ljava/lang/String;

    const/4 p1, 0x4

    iput p1, p0, LHx2;->b:I

    return-void
.end method

.method public static f()LHx2;
    .locals 1

    sget-object v0, LHx2;->c:LHx2;

    return-object v0
.end method


# virtual methods
.method public final a(I)Z
    .locals 1

    iget v0, p0, LHx2;->b:I

    if-le v0, p1, :cond_1

    iget-object v0, p0, LHx2;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LHx2;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, LHx2;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LHx2;->a:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LHx2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, LHx2;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LHx2;->a:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method
