.class public interface abstract LKC1$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKC1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:LKC1$e;

.field public static final b:LKC1$e;

.field public static final c:LKC1$e;

.field public static final d:LKC1$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LKC1$e$a;

    invoke-direct {v0}, LKC1$e$a;-><init>()V

    sput-object v0, LKC1$e;->a:LKC1$e;

    new-instance v0, LKC1$e$b;

    invoke-direct {v0}, LKC1$e$b;-><init>()V

    sput-object v0, LKC1$e;->b:LKC1$e;

    new-instance v1, LKC1$e$c;

    invoke-direct {v1}, LKC1$e$c;-><init>()V

    sput-object v1, LKC1$e;->c:LKC1$e;

    sput-object v0, LKC1$e;->d:LKC1$e;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)V
.end method
