.class public interface abstract Lab0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lab0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZa0;

    invoke-direct {v0}, LZa0;-><init>()V

    sput-object v0, Lab0;->a:Lab0;

    return-void
.end method

.method public static synthetic a(LJb0;Landroid/content/Context;)Landroidx/camera/core/impl/c;
    .locals 0

    invoke-static {p0, p1}, Lab0;->c(LJb0;Landroid/content/Context;)Landroidx/camera/core/impl/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LJb0;Landroid/content/Context;)Landroidx/camera/core/impl/c;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract b(LJb0;Landroid/content/Context;)Landroidx/camera/core/impl/c;
.end method
