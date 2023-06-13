.class public abstract LCe9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LCe9;

.field public static final b:LCe9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LYd9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYd9;-><init>(LQd9;)V

    sput-object v0, LCe9;->a:LCe9;

    new-instance v0, Loe9;

    invoke-direct {v0, v1}, Loe9;-><init>(Lge9;)V

    sput-object v0, LCe9;->b:LCe9;

    return-void
.end method

.method public synthetic constructor <init>(Lve9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()LCe9;
    .locals 1

    sget-object v0, LCe9;->a:LCe9;

    return-object v0
.end method

.method public static d()LCe9;
    .locals 1

    sget-object v0, LCe9;->b:LCe9;

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;J)V
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
