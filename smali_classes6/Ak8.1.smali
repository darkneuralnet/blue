.class public final synthetic LAk8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:Lal8;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lal8;ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAk8;->a:Lal8;

    iput p2, p0, LAk8;->b:I

    iput-object p3, p0, LAk8;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 3

    iget-object v0, p0, LAk8;->a:Lal8;

    iget v1, p0, LAk8;->b:I

    iget-object v2, p0, LAk8;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2, p1}, Lal8;->d(ILjava/util/List;Ljava/lang/Object;)LMb9;

    move-result-object p1

    return-object p1
.end method
