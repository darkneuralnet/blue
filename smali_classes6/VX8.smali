.class public final LVX8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLX8;


# instance fields
.field public final synthetic a:Lzy8;


# direct methods
.method public constructor <init>(Lzy8;)V
    .locals 0

    iput-object p1, p0, LVX8;->a:Lzy8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)B
    .locals 1

    iget-object v0, p0, LVX8;->a:Lzy8;

    invoke-virtual {v0, p1}, Lzy8;->a(I)B

    move-result p1

    return p1
.end method

.method public final zza()I
    .locals 1

    iget-object v0, p0, LVX8;->a:Lzy8;

    invoke-virtual {v0}, Lzy8;->b()I

    move-result v0

    return v0
.end method
