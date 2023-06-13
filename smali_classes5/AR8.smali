.class public final LAR8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LZN8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LAR8;)LZN8;
    .locals 0

    iget-object p0, p0, LAR8;->a:LZN8;

    return-object p0
.end method


# virtual methods
.method public final b(LZN8;)LAR8;
    .locals 0

    iput-object p1, p0, LAR8;->a:LZN8;

    return-object p0
.end method

.method public final c()LWR8;
    .locals 2

    new-instance v0, LWR8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LWR8;-><init>(LAR8;LLR8;)V

    return-object v0
.end method
