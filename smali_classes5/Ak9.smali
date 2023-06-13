.class public final LAk9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LDR7;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(LAk9;)LDR7;
    .locals 0

    iget-object p0, p0, LAk9;->a:LDR7;

    return-object p0
.end method


# virtual methods
.method public final b(LDR7;)LAk9;
    .locals 0

    iput-object p1, p0, LAk9;->a:LDR7;

    return-object p0
.end method

.method public final c()LLk9;
    .locals 2

    new-instance v0, LLk9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LLk9;-><init>(LAk9;LGk9;)V

    return-object v0
.end method
