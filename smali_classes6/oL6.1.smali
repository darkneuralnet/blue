.class public final LoL6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LwO6;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LNJ6;
    .locals 2

    iget-object v0, p0, LoL6;->a:LwO6;

    const-class v1, LwO6;

    invoke-static {v0, v1}, LpL6;->i(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LqL6;

    iget-object v1, p0, LoL6;->a:LwO6;

    invoke-direct {v0, v1}, LqL6;-><init>(LwO6;)V

    return-object v0
.end method

.method public final b(LwO6;)V
    .locals 0

    iput-object p1, p0, LoL6;->a:LwO6;

    return-void
.end method
