.class public abstract LJf8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJf8;

.field public static final b:LJf8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LKd8;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LKd8;-><init>(Lxd8;)V

    sput-object v0, LJf8;->a:LJf8;

    new-instance v0, Lgf8;

    invoke-direct {v0, v1}, Lgf8;-><init>(LYd8;)V

    sput-object v0, LJf8;->b:LJf8;

    return-void
.end method

.method public synthetic constructor <init>(Lvf8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LJf8;
    .locals 1

    sget-object v0, LJf8;->a:LJf8;

    return-object v0
.end method

.method public static d()LJf8;
    .locals 1

    sget-object v0, LJf8;->b:LJf8;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
