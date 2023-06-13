.class public final enum LdE8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LdR7;


# static fields
.field public static final enum c:LdE8;

.field public static final enum d:LdE8;

.field public static final enum e:LdE8;

.field public static final synthetic f:[LdE8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LdE8;

    const-string v1, "UNKNOWN_PERFORMANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LdE8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LdE8;->c:LdE8;

    new-instance v1, LdE8;

    const-string v3, "FAST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LdE8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LdE8;->d:LdE8;

    new-instance v3, LdE8;

    const-string v5, "ACCURATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LdE8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LdE8;->e:LdE8;

    const/4 v5, 0x3

    new-array v5, v5, [LdE8;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, LdE8;->f:[LdE8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LdE8;->b:I

    return-void
.end method

.method public static values()[LdE8;
    .locals 1

    sget-object v0, LdE8;->f:[LdE8;

    invoke-virtual {v0}, [LdE8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LdE8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LdE8;->b:I

    return v0
.end method
