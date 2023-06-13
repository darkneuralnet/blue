.class public abstract LE94;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ94;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, LQ94;->a()LQ94$a;

    move-result-object v0

    sget-object v1, Lws;->a:LFx0;

    invoke-virtual {v0, v1}, LQ94$a;->d(LFx0;)LQ94$a;

    move-result-object v0

    invoke-virtual {v0}, LQ94$a;->c()LQ94;

    move-result-object v0

    sput-object v0, LE94;->a:LQ94;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, LE94;->a:LQ94;

    invoke-virtual {v0, p0}, LQ94;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()LJk0;
.end method
