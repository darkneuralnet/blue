.class public LLw1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLw1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:[LLw1$b;


# direct methods
.method public constructor <init>(I[LLw1$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LLw1$a;->a:I

    iput-object p2, p0, LLw1$a;->b:[LLw1$b;

    return-void
.end method

.method public static a(I[LLw1$b;)LLw1$a;
    .locals 1

    new-instance v0, LLw1$a;

    invoke-direct {v0, p0, p1}, LLw1$a;-><init>(I[LLw1$b;)V

    return-object v0
.end method


# virtual methods
.method public b()[LLw1$b;
    .locals 1

    iget-object v0, p0, LLw1$a;->b:[LLw1$b;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LLw1$a;->a:I

    return v0
.end method
