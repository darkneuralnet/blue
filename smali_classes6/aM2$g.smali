.class public abstract enum LaM2$g;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LwA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaM2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LaM2$g;",
        ">;",
        "LwA1<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LaM2$g;

.field public static final enum c:LaM2$g;

.field public static final synthetic d:[LaM2$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LaM2$g$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LaM2$g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LaM2$g;->b:LaM2$g;

    new-instance v0, LaM2$g$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LaM2$g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, LaM2$g;->c:LaM2$g;

    invoke-static {}, LaM2$g;->a()[LaM2$g;

    move-result-object v0

    sput-object v0, LaM2$g;->d:[LaM2$g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILaM2$c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LaM2$g;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic a()[LaM2$g;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [LaM2$g;

    const/4 v1, 0x0

    sget-object v2, LaM2$g;->b:LaM2$g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, LaM2$g;->c:LaM2$g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LaM2$g;
    .locals 1

    const-class v0, LaM2$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LaM2$g;

    return-object p0
.end method

.method public static values()[LaM2$g;
    .locals 1

    sget-object v0, LaM2$g;->d:[LaM2$g;

    invoke-virtual {v0}, [LaM2$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LaM2$g;

    return-object v0
.end method
