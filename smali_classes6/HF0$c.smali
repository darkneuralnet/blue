.class public LHF0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHF0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Lyb4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyb4<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Z


# direct methods
.method public constructor <init>(Lyb4;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyb4<",
            "*>;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHF0$c;->a:Lyb4;

    iput-boolean p2, p0, LHF0$c;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Lyb4;ZLHF0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LHF0$c;-><init>(Lyb4;Z)V

    return-void
.end method

.method public static synthetic a(LHF0$c;)Z
    .locals 0

    iget-boolean p0, p0, LHF0$c;->b:Z

    return p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LHF0$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LHF0$c;

    iget-object v0, p1, LHF0$c;->a:Lyb4;

    iget-object v2, p0, LHF0$c;->a:Lyb4;

    invoke-virtual {v0, v2}, Lyb4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean p1, p1, LHF0$c;->b:Z

    iget-boolean v0, p0, LHF0$c;->b:Z

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LHF0$c;->a:Lyb4;

    invoke-virtual {v0}, Lyb4;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-boolean v1, p0, LHF0$c;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
